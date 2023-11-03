/*
 * XML Type:  getSituacoesDeTituloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getSituacoesDeTituloResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetSituacoesDeTituloResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSituacoesDeTituloResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetSituacoesDeTituloResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITUACOESDETITULO$0 = 
        new javax.xml.namespace.QName("", "situacoesDeTitulo");
    
    
    /**
     * Gets array of all "situacoesDeTitulo" elements
     */
    public br.jus.tjsc.www.selo.SituacaoTitulo[] getSituacoesDeTituloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SITUACOESDETITULO$0, targetList);
            br.jus.tjsc.www.selo.SituacaoTitulo[] result = new br.jus.tjsc.www.selo.SituacaoTitulo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "situacoesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.SituacaoTitulo getSituacoesDeTituloArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.SituacaoTitulo target = null;
            target = (br.jus.tjsc.www.selo.SituacaoTitulo)get_store().find_element_user(SITUACOESDETITULO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "situacoesDeTitulo" element
     */
    public int sizeOfSituacoesDeTituloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITUACOESDETITULO$0);
        }
    }
    
    /**
     * Sets array of all "situacoesDeTitulo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSituacoesDeTituloArray(br.jus.tjsc.www.selo.SituacaoTitulo[] situacoesDeTituloArray)
    {
        check_orphaned();
        arraySetterHelper(situacoesDeTituloArray, SITUACOESDETITULO$0);
    }
    
    /**
     * Sets ith "situacoesDeTitulo" element
     */
    public void setSituacoesDeTituloArray(int i, br.jus.tjsc.www.selo.SituacaoTitulo situacoesDeTitulo)
    {
        generatedSetterHelperImpl(situacoesDeTitulo, SITUACOESDETITULO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "situacoesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.SituacaoTitulo insertNewSituacoesDeTitulo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.SituacaoTitulo target = null;
            target = (br.jus.tjsc.www.selo.SituacaoTitulo)get_store().insert_element_user(SITUACOESDETITULO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "situacoesDeTitulo" element
     */
    public br.jus.tjsc.www.selo.SituacaoTitulo addNewSituacoesDeTitulo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.SituacaoTitulo target = null;
            target = (br.jus.tjsc.www.selo.SituacaoTitulo)get_store().add_element_user(SITUACOESDETITULO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "situacoesDeTitulo" element
     */
    public void removeSituacoesDeTitulo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITUACOESDETITULO$0, i);
        }
    }
}
